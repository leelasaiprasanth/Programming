def knapsack_backtracking(weights, values, capacity, n):
    def backtrack(index, current_weight, current_value):
        nonlocal max_value
        # If we have considered all items or capacity is 0
        if index >= n or current_weight >= capacity:
            max_value = max(max_value, current_value)
            return
        
        # Case 1: Exclude the current item
        backtrack(index + 1, current_weight, current_value)
        
        # Case 2: Include the current item (if it fits in the knapsack)
        if current_weight + weights[index] <= capacity:
            backtrack(index + 1, current_weight + weights[index], current_value + values[index])

    max_value = 0
    backtrack(0, 0, 0)
    return max_value

if __name__ == "__main__":
    # Example weights, values and capacity
    weights = [1, 2, 3, 8, 7, 4]
    values = [20, 5, 10, 40, 15, 25]
    capacity = 10
    
    max_value = knapsack_backtracking(weights, values, capacity, len(weights))
    print(f"Maximum value in knapsack: {max_value}")
