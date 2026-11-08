r, c = list(map(int, input().split()))
graph = [["X"] * c for i in range(r)]
for i in range(r):
    a = input()
    for j in range(c):
        graph[i][j] = a[j]


def dfs(cr, cc):
    if graph[cr][cc] == ".":
        return

    graph[cr][cc] = "."
    if cr - 1 >= 0:
        dfs(cr - 1, cc)
    if cc - 1 >= 0:
        dfs(cr, cc - 1)


count = 0
for i in range(r - 1, -1, -1):
    for j in range(c - 1, -1, -1):
        if graph[i][j] == "*":
            count += 1
            dfs(i, j)

print(count)


"""
4 4
***.
....
.**.
.**.

"""