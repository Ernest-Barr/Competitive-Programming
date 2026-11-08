n = int(input())

store_bought = 0
reserve = 0
for i in range(n):
    bags_deliv, bags_needed = list(map(int, input().split()))
    if bags_needed - bags_deliv > reserve:
        store_bought += bags_needed - bags_deliv - reserve
        reserve = 0
    else:
        reserve += bags_deliv - bags_needed

print(store_bought)