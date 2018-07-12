Why does FixedArrayQueue require an explicit constructor?
Answer:
-------
FixedArrayQueue has an uninitialized array named data.
But, If we want to use the array in FixedArrayQueue, then we have to allocate memory for it.
For this we need the capacity of the array.
To pass this capacity as argument(Input to the constructor) then FixedArrayQueue require an explicit constructor.


What happens when you offer an item to a full FixedArrayQueue?
Answer:
-------
Full FixedArrayQueue means there is no slot to insert new element. 
In this case, offer returns false.


What happens when you poll an empty FixedArrayQueue?
Answer:
-------
Empty FixedArrayQueue means there are no elements in the array.
In this case, offer returns null.


What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
Answer:
-------
            Time complexity     Space complexity
offer   -       O(1)                O(1)
peek    -       O(1)                O(1)
poll    -       O(1)                O(1)
isEmpty -       O(1)                O(1)
size    -       O(1)                O(1)
asList  -       O(n)                O(n)
Where n is the size of the array