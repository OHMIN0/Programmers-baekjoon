
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


typedef struct
{
	int x;
	int y;
} dot;

int compare(const void *a, const void *b)
{
	dot A = *(dot *)a;
	dot B = *(dot *)b;

	if (A.x > B.x) {
		return 1;
	}
	else if (A.x == B.x) {
		if (A.y > B.y)
			return 1;
		else
			return -1;
	}

	return -1;
}


int main()
{
	int n;
	scanf("%d", &n);

	dot d[n];

	for (int i = 0; i<n; i++) {
		scanf("%d %d", &d[i].x, &d[i].y);
	}

	qsort(d, n, sizeof(dot), compare);

	for (int i = 0; i<n; i++) {
		printf("%d %d\n", d[i].x, d[i].y);
	}

	return 0;
}



