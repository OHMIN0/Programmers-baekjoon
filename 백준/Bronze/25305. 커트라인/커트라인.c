
#include <stdio.h>
#include <math.h>


int sort(int n, int a[]) {
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
	return a;
}

int main()
{
	int n, k;
	scanf("%d %d", &n, &k);

	int a[n];
	for (int i = 0; i<n; i++) {
		scanf("%d", &a[i]);
	}

	sort(n, a);

	printf("%d", a[n-k]);


	return 0;
}
