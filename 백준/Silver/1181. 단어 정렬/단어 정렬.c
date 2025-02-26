
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>



int compare(const void* a, const void* b)
{
	// 비교대상a의 길이가 더 긴 경우
	if (strlen((const char*)a) > strlen((const char*)b))
		return 1;
	// 비교대상b의 길이가 더 긴 경우
	else if (strlen((const char*)a) < strlen((const char*)b))
		return -1;
	// a,b의 길이가 같은 경우.
	// a가 사전순이 앞서면 1이 return되고, 아니면 0이 return됨.
	else
		return strcmp((char*)a, (char*)b);
}

int main()
{
	int n;
	scanf("%d", &n);

	char s[n][51];
	// 문자열의 마지막 인덱스는 "\n"로 채워지기 때문.

	for (int i = 0; i<n; i++) {
		scanf("%s", s[i]);
	}

	qsort(s, n, sizeof(s[0]), compare);

	for (int i = 0; i<n; i++) {
		if (strcmp(s[i], s[i+1]) != 0 || i == n-1)
			printf("%s\n", s[i]);
	}



	return 0;
}
