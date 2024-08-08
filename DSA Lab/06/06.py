import time
import random

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    def merge(left, right):
        result = []
        i = j = 0
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                result.append(left[i])
                i += 1
            else:
                result.append(right[j])
                j += 1
        result.extend(left[i:])
        result.extend(right[j:])
        return result
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    return merge(left, right)

def measure_time(sort_function, arr):
    start_time = time.time()
    sort_function(arr)
    end_time = time.time()
    return end_time - start_time

def generate_random_list(size):
    return [random.randint(0, 100) for _ in range(size)]

def generate_sorted_list(size):
    return list(range(size))

def generate_reverse_sorted_list(size):
    return list(range(size, 0, -1))

if __name__ == "__main__":
    sizes = [10, 50, 100]  # Different input sizes to test

    print("Quick Sort vs Merge Sort")
    for size in sizes:
        random_list = generate_random_list(size)
        sorted_list = generate_sorted_list(size)
        reverse_sorted_list = generate_reverse_sorted_list(size)

        print(f"\nInput size: {size}")

        # Average case (random list)
        time_quick_sort_avg = measure_time(quick_sort, random_list.copy())
        time_merge_sort_avg = measure_time(merge_sort, random_list.copy())
        print(f"Average Case - Quick Sort: {time_quick_sort_avg:.6f} seconds")
        print(f"Average Case - Merge Sort: {time_merge_sort_avg:.6f} seconds")

        # Best case (sorted list)
        time_quick_sort_best = measure_time(quick_sort, sorted_list.copy())
        time_merge_sort_best = measure_time(merge_sort, sorted_list.copy())
        print(f"Best Case - Quick Sort: {time_quick_sort_best:.6f} seconds")
        print(f"Best Case - Merge Sort: {time_merge_sort_best:.6f} seconds")

        # Worst case (reverse sorted list)
        time_quick_sort_worst = measure_time(quick_sort, reverse_sorted_list.copy())
        time_merge_sort_worst = measure_time(merge_sort, reverse_sorted_list.copy())
        print(f"Worst Case - Quick Sort: {time_quick_sort_worst:.6f} seconds")
        print(f"Worst Case - Merge Sort: {time_merge_sort_worst:.6f} seconds")
