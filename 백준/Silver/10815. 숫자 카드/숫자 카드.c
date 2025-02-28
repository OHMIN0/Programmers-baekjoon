
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int compare(const int* a, const int* b)
{
	return *(int*)a > *(int*)b;
}

// ============== 이진검색 ===============
int search(int arr[], int n, int s)
{
	//arr : 검색 대상 배열, n : 배열 요소 수, s : 검색값
	int mid, left = 0;
	int right = n-1;

	while (right >= left) {
		mid = (left + right)/2;
		if (s == arr[mid])
			return 1;
		if (s < arr[mid])
			right = mid - 1;
		else
			left = mid + 1;
	}
	return 0;
}

int main()
{
	int n; // 숫자카드 갯수
	scanf("%d", &n);

	int* a = (int*)malloc(n * sizeof(int)); // 숫자 카드들
	for (int i = 0; i<n; i++) {
		scanf("%d", &a[i]);
	}

	qsort(a, n, sizeof(int), compare);

	int m; // 상근이가 갖고있을 카드 갯수
	scanf("%d", &m);

	int b[m]; // 상근이가 갖고있는 카드들
	for (int i = 0; i<m; i++) {
		scanf("%d", &b[i]);
		printf("%d ", search(a, n, b[i]));
	}
	free(a);
	return 0;
}

/* =========== 맨 첨에 시도한 방식, 순차검색 ============
typedef struct {
	int num;
	int chk;
}Check;


int main()
{
	int n; // 숫자카드 갯수
	scanf("%d", &n);

	int a[n]; // 숫자 카드들
	for (int i = 0; i<n; i++) {
		scanf("%d", &a[i]);
	}


	int m; // 상근이가 갖고있을 카드 갯수
	scanf("%d", &m);

	Check b[m]; // 상근이가 갖고있는 카드들
	for (int i = 0; i<m; i++) {
		scanf("%d", &b[i].num);
		b[i].chk = 0; // 0으로 초기화해두고, 이따 비교할때 숫자카드와 겹칠경우 1로 바꿀예정.
	}

	// a[]의 숫자카드들을 하나씩 b[].num과 비교하고,
	// 만약 존재할 경우 b[].chk를 1로 바꿀 반복문.
	for (int i = 0; i<n; i++) {
		for (int j = 0; j<m; j++) {
			if (a[i] == b[j].num)
				b[j].chk = 1;
		}
	}

	for (int i = 0; i<m; i++) {
		printf("%d ", b[i].chk);
	}

	return 0;
}
=========== 맨 첨에 시도한 방식, 순차검색 ============ */
