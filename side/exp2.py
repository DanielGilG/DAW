import cmath as m
print ("EXPONENTIAL CONVERTER")

origin = float(input("Enter start angle: "))
final = float(input("Enter final angle: "))
steps = int(input("Enter many steps: "))

def fun (origin, value, steps):
    for i in range(steps + 1):
        x = i / steps
        current = origin + (final - origin) * (x ** 2)
        print(f"Step {i}: {current:.4f}")

fun (origin, final, steps)
