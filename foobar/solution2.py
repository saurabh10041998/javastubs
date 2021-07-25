def solution(x, y):
    a_1_1 = 1
    a_1_y = a_1_1 + ((y - 1) * y) // 2
    a_x_y  = a_1_y + (x - 1) *  y +  ((x - 1) * x) // 2
    return str(a_x_y)

print(solution(5, 10))