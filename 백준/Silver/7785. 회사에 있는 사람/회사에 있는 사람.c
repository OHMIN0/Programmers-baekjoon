
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

typedef struct {
	char name[6];
	char inout[6];
}employee;

int compare(const employee* a, const employee* b)
{
	return strcmp(b->name, a->name);
}

int main(void)
{
	int n;
	scanf("%d", &n);
	employee arr[n];

	for (int i = 0; i < n; i++) {
		scanf("%s %s", arr[i].name, arr[i].inout);
	}


	qsort(arr,n,sizeof(employee),compare);

	for (int i=0; i<n; i++) {

		if (strcmp(arr[i].name, arr[i+1].name) == 0)
			i++;
		else
			printf("%s\n", arr[i].name);
	}

	return 0;
}
