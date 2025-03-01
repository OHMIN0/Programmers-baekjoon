
#include <stdio.h>
#include <math.h>


int main()
{
	int n;
	scanf("%d", &n);

	int a[n];
	for (int i = 0; i<n; i++) {
		scanf("%d", &a[i]);
	}

	int tmp = 0;
	for (int i = 0; i<n; i++) {
		for (int j = i+1; j<n; j++) {
			if (a[i] > a[j]) {
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
	}

	for (int i = 0; i<n; i++) {
		printf("%d\n", a[i]);
	}
	return 0;
}

