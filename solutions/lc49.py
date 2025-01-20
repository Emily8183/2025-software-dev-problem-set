class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # defaultdict 是 Python 的一种特殊字典，它会自动为不存在的键生成默认值。
        res = defaultdict(list)

        for s in strs:
            count = [0] * 26

            for c in s:
                count[ord(c)-ord("a")] += 1

            res[tuple(count)].append(s) #相当于res[key]，所对应的值append s

        return list(res.values())