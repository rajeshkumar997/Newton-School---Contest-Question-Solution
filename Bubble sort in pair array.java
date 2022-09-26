/*
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/ 
// static class element implements Comparator<Pair>{
//     public int compare(Pair a, Pair b){
//         if(a.x == b.x){
//             return b.y - a.y;
//         }
//         return b.x - a.x;
//     }
// }
// static Pair[] SortPair(Pair arr[], int n)  { 
//  //enter your code here
//  Arrays.sort(arr, new element());
//  return arr;
//  }


static Pair[] SortPair(Pair arr[], int n)  { 
 //enter your code here

		for (int i=0; i<n-1; i++) { // i=3
			for (int j=0; j<n-i-1; j++) { // j=n-4
				if (arr[j].x < arr[j+1].x) {
					// swap
					Pair temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}

				else if (arr[j].x == arr[j+1].x && arr[j].y < arr[j+1].y) {
					// swap
					Pair temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		return arr;
 }
