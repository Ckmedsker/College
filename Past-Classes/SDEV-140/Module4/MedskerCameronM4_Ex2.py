shop_prices = {'Steak': 50, 'Chicken': 30, 'Fruit': 5, 'Golden Burger': 500, 'Burger': 40, 'Toast': 4.99}
lowest_to_highest = {}


prices = list(shop_prices.values())
prices.sort()

for price in prices:
    for (item, item_price) in shop_prices.items():
        if item_price == price:
            lowest_to_highest[item] = item_price

for index in range(1, 4):
    print(f"{list(lowest_to_highest.keys())[-index]} {list(lowest_to_highest.values())[-index]}")
