# Divide seconds_per_day by seconds_per_hour, using integer (//) division. Did
# this number agree with the floating-point value from the previous question,
# aside from the final .0?

# Establishing the variables
SECONDS_IN_MINUTE = 60
MINUTES_IN_HOUR = 60
HOURS_IN_DAY = 24

# Completing the operation
seconds_per_hour = SECONDS_IN_MINUTE * MINUTES_IN_HOUR

# Completing the operation
seconds_per_day = seconds_per_hour * HOURS_IN_DAY

# Completing the operation and printing
print(seconds_per_day // seconds_per_hour)


# The numbers at first glance seem to be the same, but the 3.5 version comes out
# as a float type, while the 3.6 version comes out as an integer type. In this
# case however, they are essentially the same number