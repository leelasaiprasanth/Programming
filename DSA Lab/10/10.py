def print_board(board):
    for row in board:
        print(' '.join('Q' if col else '.' for col in row))
    print()

def is_safe(board, row, col, n):
    # Check this row on the left side
    for i in range(col):
        if board[row][i]:
            return False

    # Check upper diagonal on the left side
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
        if board[i][j]:
            return False

    # Check lower diagonal on the left side
    for i, j in zip(range(row, n, 1), range(col, -1, -1)):
        if board[i][j]:
            return False

    return True

def solve_n_queens_util(board, col, n):
    # Base case: If all queens are placed
    if col >= n:
        print_board(board)
        return True

    res = False
    for i in range(n):
        if is_safe(board, i, col, n):
            board[i][col] = True
            res = solve_n_queens_util(board, col + 1, n) or res
            board[i][col] = False

    return res

def solve_n_queens(n):
    board = [[False] * n for _ in range(n)]
    if not solve_n_queens_util(board, 0, n):
        print("No solution exists")

if __name__ == "__main__":
    n = 4  # Change this value for different sizes of the board
    solve_n_queens(n)
