
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void swap(int *a, int *b) {
	int tmp = *a;
	*a = *b;
	*b = tmp;
}


int compare(const void *a, const void *b)
{
    if (*(int *)a > *(int *)b)
        return 1;
    else if (*(int *)a < *(int *)b)
        return -1;
    else
        return 0;
}


int main()
{
	int n;
	scanf("%d", &n);

	int a[n];
	for (int i=0;i<n;i++) {
		scanf("%d", &a[i]);
	}

	qsort(a, n, sizeof(int), compare);

	for (int i=0;i<n;i++) {
		printf("%d\n", a[i]);
	}


	return 0;
}
