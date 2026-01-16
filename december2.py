num_reports = 1000
reports = []
num_safe_reports = 0

for i in range(num_reports):
    line = input().split()
    for j in range(len(line)):
        line[j] = int(line[j])
    reports.append(line)

for i in range(num_reports):
    increasing = None
    for j in range(len(reports[i]) - 1):

        if 1 <= abs(reports[i][j] - reports[i][j + 1]) <= 3:
            if reports[i][j + 1] > reports[i][j] and (j == 0 or increasing):
                increasing = True
                if j == len(reports[i])-2: num_safe_reports += 1
            elif reports[i][j + 1] < reports[i][j] and (j == 0 or not increasing):
                increasing = False
                if j == len(reports[i])-2: num_safe_reports += 1
            else:
                break
        else:
            break

print(num_safe_reports)
