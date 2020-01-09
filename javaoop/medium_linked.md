
Linked List Implementation Guide
Hermann Krohn
Follow
Jul 2, 2019 · 6 min read

Introduction
In this guide I will explain how to implement a linked list. If you do not know what a linked list is, I recommend you read my other blog, found here, where I explain in detail what a linked list is and how it works. For this blog, I will focus on the implementation.
Implementation Guide
The following figures demonstrate the implementation of a linked list. Although, the demonstration was written in C, the procedure and steps shown are applicable to implementing a linked list using any programming language.
Required Libraries and Structure Definitions
Figure 1 below includes the required libraries, defines two functions that are commonly used throughout the demonstration, and details the structure of a node and a linked list. A node is defined to contain an integer (data) and a pointer to the next node. Likewise, a list contains an integer to represent the size of the list and a pointer (head) which points to the first node in the list. The initList function initializes the head pointer to null and the size of the list to zero as there are no nodes in the list initially. The isEmpty function determines if a list is empty.

Figure 1: Require libraries and structure/function definitions
Prepend Node to List
The insertFront function accepts two parameters: a linked list and a value to insert into the list. Line 30 in Figure 2 allocates memory for a node and initializes a pointer to point to the allocated space. If the memory was successfully allocated, the function then increments the size of the list by one and determines if the list is empty before inserting the new node to the list. If the list is empty, the list’s head pointer points to the new node, and the new node’s next pointer points to null. Otherwise, the new node’s next pointer points to the node that the list’s head is pointing to, and then the list’s head pointer is updated to point to the new node.

Figure 2: Function to insert node to the front of a linked list
Append Node to List
The insertEnd function accepts two parameters: a linked list and a value to insert to the end of the list. Line 49 in Figure 3 allocates memory for a node and initializes a pointer to point to the allocated space. If the memory was successfully allocated, the function then increments the size of the list by one and determines if the list is empty before inserting the new node to the list. If the list is empty, the new node is inserted to the list by updating the list’s head pointer to point to the new node. Otherwise, a pointer is initialized in order to transverse the list. The pointer iterates through the list until it points to the last node. Once the last node is found, that node’s next pointer is updated to point to the new node.

Figure 3: Function to insert node to the end of a linked list
Delete Node from the Front of List
The deleteFront function accepts one parameter: a linked list. This function first determines if the list is empty. If the list in not empty, the function then initializes a pointer to point to the first node in the list. The list’s head pointer is then updated to point to the the next node in the list, or null if there is not another node in the list. The pointer that was previously initialized is then used to remove the first node from memory. Finally, the list’s size is decreased by one.

Figure 4: Function to remove first node from linked list
Delete Node from the End of List
The deleteEnd function accepts one parameter: a linked list. This function first determines if the list is empty. If it is not empty, two pointers are initialized. One pointer (currentNode) points to the first node while the other pointer (nextNode) points to either the next node or null if there is only one node in the list. The nextNode pointer is used to iterate through the linked list until it points to the last node, and the currentNode pointer points to the penultimate node. Then, the currentNode’s next pointer is updated to null and the nextNode’s pointer is used to remove the last node from memory. Finally, the list’s size is decreased by one.

Figure 5: Function to remove last node from linked list
Function to Insert Node at Desired Location
The insertNodeAtLocation function accepts three parameters: a linked list, a location, and a value. The purpose of this function is to insert a node at a desired location. For example, if the desired location is three and the data value is five (insertNodeAtLocation(list, 3, 5)), then the function is to create a node with data value of five and place the created node as the third node in the list. To fulfill the requirements of the function, the first step is to determine if the inputed location is valid by checking if the inputed location’s value is equal to or greater than one but less than the list’s size plus one. If the location is valid, the function then checks if the desired location’s value is one, which would then invoke the insertFront function shown in Figure 2. Otherwise, the list’s size is incremented by one, a counter is created to keep track of the current location in the list, memory is allocated for the new node, and a pointer is initialized in order to iterate through the list. Once the pointer points to the node (node A) whose location is right before the desired location, the new node’s next pointer is updated to point to the node currently following node A. Then, node A’s next pointer is updated to point to the new node.

Figure 6: Function to insert a node at a desired location in the linked list
Function to Remove Node with Specified Value
The removeNode function accepts two parameters: a list and a value. The function first determines if the list is empty. If it is not empty, the function then initializes two pointers (currentNode and prevNode). Initially, currentNode points to the list’s head while prevNode points to null. The removeNode function then checks if the currentNode’s data equals the inputed value. If they are equal, the deleteFront function shown in Figure 4 is invoked. Otherwise, the prevNode pointer is updated to point to currentNode and currentNode is updated to point to the next node. Then, the pointers iterate through the list until currentNode equals null. If at any point while iterating the currentNode’s data equals the inputted value, the list’s size is reduced by one, prevNode’s next pointer is updated to point to the node following currentNode, and currentNode is used to remove the deleted node from memory before the function is terminated. If the inputted value is not found in the list, the function outputs “Value not found in list” to the console.

Figure 7: Function to remove first node in list containing specified value
Print Linked List
The printLinkedList function accepts one parameter: a linked list. The function first initializes a pointer that will be used to iterate through the list. If the list is empty, the functions outputs “The list is empty” to the console. Otherwise, the functions outputs the number of nodes in the list, and the data value of each node in the list.

Figure 8: Function to print the value of each node in the list
Main Function
The main function is the function that runs when a C program is executed. As shown in Figure 9, the linked list is initialized and nodes are inserted/deleted from the list using the functions defined above.

Figure 9: The main function
When executed, the main function outputs the following.

Figure 10: The output from the main function
Conclusion
To conclude, linked list are a really cool way to structure data. As previously mentioned, if you would like a to understand how linked list work or when to use them, check out my other blog here.
Towards Data Science
Sharing concepts, ideas, and codes.
Following
12

Data Structures
Linked Lists
Programming
C
12 claps


Hermann Krohn
WRITTEN BY

Hermann Krohn
Follow
Towards Data Science
Towards Data Science
Following
Sharing concepts, ideas, and codes.
Write the first response
Discover Medium
Welcome to a place where words matter. On Medium, smart voices and original ideas take center stage - with no ads in sight. Watch
Make Medium yours
Follow all the topics you care about, and we’ll deliver the best stories for you to your homepage and inbox. Explore
Explore your membership
Thank you for being a member of Medium. You get unlimited access to insightful stories from amazing thinkers and storytellers. Browse
About
Help
Legal