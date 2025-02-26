
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


typedef struct
{
	int age;
	char name[101];
	int num;
}inform;


int compare(const void* a, const void* b)
{
	inform A = *(inform*)a;
	inform B = *(inform*)b;

	// A의 나이가 더 큰 경우
	if (A.age > B.age)
		return 1;
	// A, B 나이가 같은 경우
	else if (A.age == B.age) {
		if (A.num > B.num)
			return 1;
		else
			return -1;
	}
	// B가 나이가 더 큰 경우
	return -1;
}


int main()
{
	int n;
	scanf("%d", &n);

	inform inf[n];
	// 문자열의 마지막 인덱스는 "\n"로 채워지기 때문.

	for (int i = 0; i<n; i++) {
		scanf("%d %s", &inf[i].age, inf[i].name);
		inf[i].num = i;
	}

	qsort(inf, n, sizeof(inf[0]), compare);

	for (int i = 0; i<n; i++) {
		printf("%d %s\n", inf[i].age, inf[i].name);
	}


	return 0;
}
