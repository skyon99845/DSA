#include <bits/stdc++.h>
using namespace std;

void selection(int arr[])
{
    int min_index;
    for (int i = 0; i < 5; i++)
    {

        min_index = i;
        int min_element = arr[i];
        for (int j = i + 1; j < 5; j++)
        {
            //cout << " element :" << arr[j] << endl;

            if (arr[j] <= min_element)
            {
                min_index = j;
                min_element = arr[j];
            }
        }
        /*
        //cout << "min_index" << min_index << endl;
        //cout << "min_element" << min_element << endl;
        cout << "arr[min_index]=" << arr[min_index] << " arr[i]" << arr[i] << endl;
        */
        arr[min_index] = arr[i];
        arr[i] = min_element;
        //cout << "arr[min_index]=" << arr[min_index] << " arr[i]" << arr[i] << endl;
    }

    cout << endl;
    cout << endl;
    cout << "Sorted Array is :";
    for (int i = 0; i < 5; i++)
    {

        cout << arr[i] << "->";
    }
}
int main()
{

    int arr[5];
    for (int i = 0; i < 5; i++)
    {
        cout << "Enter the number " << i << " :";

        cin >> arr[i];
    }
    selection(arr);
    return 0;
}