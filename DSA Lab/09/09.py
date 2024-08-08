def knapsack(weights, values, capacity):
    n = len(weights)
    # Create a 2D list to store the maximum value that can be achieved with each capacity
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]

    for i in range(1, n + 1):
        for w in range(capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1])
            else:
                dp[i][w] = dp[i - 1][w]

    return dp[n][capacity]

if __name__ == "__main__":
    # Example weights, values and capacity
    weights = [1, 2, 3, 8, 7, 4]
    values = [20, 5, 10, 40, 15, 25]
    capacity = 10

    max_value = knapsack(weights, values, capacity)
    print(f"Maximum value in knapsack: {max_value}")
