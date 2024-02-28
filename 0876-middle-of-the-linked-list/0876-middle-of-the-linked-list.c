/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* temp=head;
    int count=0;
    while(temp){
        count++;
        temp=temp->next;
    }
    int mid=count/2;
    temp=head;
        if(temp->next==NULL)return head;
    while(mid>0){
        temp=temp->next;
        mid--;
    }
    if(count/2==0)return temp->next;
    return temp;
}