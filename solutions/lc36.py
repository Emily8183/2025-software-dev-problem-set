class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        seen = set()

        row, column = 9, 9

        for i in range(row):
            for j in range(column):
                num = board[i][j]

                if num != '.':
                    if (f"{num} in row {i}" in seen or
                        f"{num} in col {j}" in seen or
                        f"{num} in box {i//3} {j//3}" in seen):
                        return False

                    seen.add(f"{num} in row {i}")
                    seen.add(f"{num} in col {j}")
                    seen.add(f"{num} in box {i//3} {j//3}")

        return True