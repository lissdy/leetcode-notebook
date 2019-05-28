# https://leetcode.com/problems/number-of-lines-to-write-string/

806. Number of Lines To Write String

Runtime: 32 ms, faster than 97.44% of Ruby online submissions for Number of Lines To Write String.
Memory Usage: 9.4 MB, less than 82.35% of Ruby online submissions for Number of Lines To Write String.

执行用时 : 68 ms, 在Number of Lines To Write String的Ruby提交中击败了100.00% 的用户
内存消耗 : 9.5 MB, 在Number of Lines To Write String的Ruby提交中击败了100.00% 的用户

# @param {Integer[]} widths
# @param {String} s
# @return {Integer[]}
def number_of_lines(widths, s)
    dir = {}
    line = 0
    last_num = 0
    ('a'..'z').each_with_index do |k,v|
        dir[k] = widths[v]
    end
    s.split("").each do |x|
        if last_num + dir[x] > 100
            last_num = dir[x]
            line +=1
        else
            last_num += dir[x]
        end
    end
    line += 1 if last_num != 0
    [line,last_num]
end