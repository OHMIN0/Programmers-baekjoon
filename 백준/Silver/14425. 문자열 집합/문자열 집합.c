
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


// 비교 함수: 사전순 정렬
int compare(const void *a, const void *b) {
    return strcmp((const char *)a, (const char *)b);
}

// ============== 이진검색 ===============
int binarySearch(char (*arr)[501], int size, char *target) {
    int left = 0;
    int right = size - 1;

    while (left <= right) {
        int mid = left + (right - left)/2; // 중간 인덱스 계산 (오버플로우 방지)
        int cmp = strcmp(arr[mid], target);

        if (cmp == 0) // 값을 찾음
            return mid;
        if (cmp < 0) // 오른쪽 절반 탐색
            left = mid + 1;
        else // 왼쪽 절반 탐색
            right = mid - 1;
    }
    return -1; // 찾지 못함
}


int main()
{
	int n, m, cnt = 0;
	scanf("%d %d", &n, &m);

	// 문자열배열 입력받음
	char (*s)[501] = malloc(n*sizeof(*s));
	for (int i = 0; i<n; i++) {
		scanf("%s", s[i]);
	}

	// qsort로 정렬시킴
	qsort(s, n, sizeof(s[0]), compare);

	// 타겟문자열 입력받고 검색
	for (int i = 0; i<m; i++) {
		char target[501];
		scanf("%s", target);

		// 이진검색함수는 타겟값을 못찾으면 -1 반환.
		// 따라서 -1이 아니라면 값을 찾은것이므로 cnt++;
		if (binarySearch(s, n, target) != -1)
			cnt++;
	}

	// 결과 출력
	printf("%d", cnt);

	return 0;
}
