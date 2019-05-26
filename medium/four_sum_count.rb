#https://leetcode.com/problems/4sum-ii/
#454. 4Sum II

def four_sum_count(a, b, c, d)
    result = 0
    size = a.size-1
    first = Hash.new(0)
    (0..size).each do |xa|
        (0..size).each do |xb|
           first[a[xa] + b[xb]] += 1
        end
    end
    (0..size).each do |xc|
        (0..size).each do |xd|
            result += first[-(c[xc]+d[xd])] if first.key?(-(c[xc]+d[xd]))
        end
    end
    result
end