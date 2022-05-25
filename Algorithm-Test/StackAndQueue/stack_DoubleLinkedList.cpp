#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


void pushNode();
void popNode();
void showAllNodes();
void exit();

struct NODE
{
	NODE*pre;
	NODE*next;

	int number;
};

NODE* head;
NODE* tail;

int main() {
	int a;
	/*

	head = (NODE*)malloc(sizeof(struct NODE));
	head->next = NULL;
	head->pre = NULL;
	tail = head;
	*/

	head = (NODE*)malloc(sizeof(struct NODE));
	tail = (NODE*)malloc(sizeof(struct NODE));
	head->next = tail;
	tail->pre = head;


	while (true) {
		printf("1. push \n2. pop \n3. show all nodes \n-1. exit \n > ");
		scanf("%d", &a);

		switch (a)
		{
		case 1:
			pushNode();
			break;

		case 2:
			popNode();
			break;
		case 3:
			showAllNodes();
			break;
		case -1:
			exit();
			break;

		}
	}

	return 0;
}

int isEmpty() {
	if (head->next == NULL) {
		return 1;
	}
	else
		return 0;
}

void pushNode() {
	printf("number : ");
	int num = 0;
	scanf("%d", &num);

	NODE* node = (NODE*)malloc(sizeof(struct NODE));
	node->number = num;


	if (isEmpty()) {
		head->next = node;
		tail->pre = node;

		node->next = tail;
		node->pre = head;

	}
	else {
		NODE* end = tail->pre;
		end->next = node;
		node->pre = end;

		node->next = tail;
		tail->pre = node;
	}
}

void showAllNodes() {
	NODE* now = head->next; // 林家历厘
	printf("showMethod\n");
	while (now != tail) {
		printf("number : %d\n", now->number);
		now = now->next;
	}
	printf("End\n");
}


void popNode() {

	if (!isEmpty()) {

		NODE* prevNode = tail->pre->pre;
		NODE* deleteNode = prevNode->next;
//		printf("popNode Number : %d\n", prevNode->number);
		prevNode->next = tail;
		tail->pre = prevNode;

//		printf("deleteNode Number : %d\n", deleteNode->number);
		free(deleteNode);
	}
	else {
		printf("There is no Node\n");
	}
}
void exit() {
	printf("headNumber : %d\n", head->number);
	printf("headAddress : %p\n", head);
	printf("tailNumber : %d\n", tail->number);
	printf("tailAddress : %p\n", tail);
	printf("tailPrevNumber : %d\n", tail->pre->number);


	NODE* now = head; // 林家历厘
	while (now != tail) {
		printf("Node(%d) has been POP\n", now->number);
		NODE* deleteNode = now;
		now = now->next;
		free(deleteNode);
	}

	printf("Node(%d) has been POP\n", tail->number);

	printf("end");
	free(tail);
	exit(0);

}