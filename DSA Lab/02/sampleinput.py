import random

# Set seed for reproducibility
random.seed(42)

# Generate 100 random integers between 0 and 999
random_elements = [random.randint(0, 999) for _ in range(100)]

print(random_elements)

# [654, 114, 25, 759, 281, 250, 228, 142, 754, 104, 692, 758, 913, 558, 89, 604, 432, 32, 30, 95, 223, 238, 517, 616, 27, 574, 203, 733, 665, 718, 558, 429, 225, 459, 603, 284, 828, 890, 6, 777, 825, 163, 714, 432, 348, 284, 159, 220, 980, 781, 344, 104, 94, 389, 99, 367, 867, 352, 618, 270, 826, 44, 747, 470, 549, 127, 996, 944, 387, 80, 565, 300, 849, 643, 633, 906, 882, 370, 591, 196, 721, 71, 46, 677, 233, 791, 296, 81, 875, 238, 887, 103, 389, 284, 464, 650, 854, 373, 166, 379]