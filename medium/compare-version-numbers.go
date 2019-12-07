package medium

import (
	"strings"
	"strconv"
	"fmt"
)

func compareVersion(version1 string, version2 string) int {
	var version1Num []string = strings.Split(version1, ".")
	var version2Num []string = strings.Split(version2, ".")

	for i := 0; i <= max(len(version1Num), len(version2Num)); i++ {
		v1, v2 := 0, 0
		if i < len(version1Num) {
			v1,_ = strconv.Atoi(version1Num[i])
		}
		if i < len(version2Num) {
			v2,_ = strconv.Atoi(version2Num[i])
		}
		fmt.Println(v1)
		if v1 > v2 {
			return 1
		} else if v1 < v2 {
			return -1
		}
	}
	return 0

}

func max(a, b int) int {
	if a < b {
		return b
	}
	return a
}
