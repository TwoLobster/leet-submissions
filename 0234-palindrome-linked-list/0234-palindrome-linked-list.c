/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode *temp=head;
    int count=0;
    while(temp){
        count++;
        temp=temp->next;
    }
    int arr[count];
    temp=head;
    for(int j=0; j<count; j++){
        arr[j]=temp->val;
        temp=temp->next;
    }
    for(int i=0; i<count/2; i++){
        if (arr[i]!=arr[count-i-1]) return false;
        else continue;
    }
    return true;
}