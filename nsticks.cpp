#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

int nRopes(int a[], int n) {
    sort(a, a + n);
    int t = 0;
    priority_queue<int, vector<int>, greater<int>> p;
    for (int i = 0; i < n; ++i)
        p.push(a[i]);
    while (p.size() > 1) {
        int x = p.top();
        p.pop();
        int y = p.top();
        p.pop();
        int c = x + y;
        t += c;
        p.push(c);
    }
    return t;
}

int main() {
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; ++i)
        cin >> a[i];
    cout << "Total Cost: " << nRopes(a, n) << endl;
    return 0;
}
