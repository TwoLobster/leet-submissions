/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode *temp=head;
    int count=0, number=0;
    while(temp){
        count++;
        temp=temp->next;
    }
    temp=head;
    for(int i=count-1; i>=0; i--){
        number+=(pow(2, i))*(temp->val);
        temp=temp->next;
    }
    return number;
}