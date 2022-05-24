#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


void pushNode();
void popNode();
void showAllNodes();
void exit();

struct NODE
{
	NODE* next;
	int number;
};

NODE* head;

int main() {
	int a;
	head = (NODE*)malloc(sizeof(struct NODE));
	head->next = NULL;

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

//void pushNode() {
//
//	NODE* node;
//
//
//	printf("number : ");
//	int num = 0;
//	scanf("%d", &num);
//	
//	if (isEmpty()) {
//		node = (NODE*)malloc(sizeof(struct NODE));
//		node->number = num;
//		node->next = NULL;
//		head->next = node;
//	}
//	else {
//		node = head->next;
//		while (node->next != NULL) {
//			node = node->next;
//		}
//
//		NODE * new_node = (NODE*)malloc(sizeof(struct NODE));
//		new_node->next = NULL;
//		new_node->number = num;
//		node->next = new_node;
//
//	}
//}

//void showAllNodes() {
//
//	NODE* node = head->next;
//
//	while (node->next != NULL) {
//		printf("Number : %d\n", node->number);
//		node = node->next;
//	}
//
//}
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
	node->next = NULL;
	if (isEmpty()) {
		head->next = node;
	}
	else {
		NODE* top = head->next;
		while (top->next != NULL) {
			top = top->next;
		}
		top->next = node;
		
	}
}








void showAllNodes() {
	NODE* now = head->next; // 林家历厘

	while (now->next != NULL) {
		now = now->next;
	}
	printf("number : %d\n", now->number);
}


void popNode() {

	if (!isEmpty()) {
		
		NODE* now = head; // 林家历厘

		while (now->next->next != NULL) {
			now = now->next;
		}
		printf(" POP (0x%p) : %d  \n", now->next, now->next->number);

		free(now->next->next);
		now->next = NULL;
	}
	else {
		printf("There is no Node\n");
	}
}
void exit() {

	NODE* now = head; // 林家历厘
	while (now->next != NULL) {
		printf("Node(%d) has been POP\n", now->number);
		NODE* deleteNode = now;
		now = now->next;
		free(deleteNode);
	}
	printf("Node(%d) has been POP\n", now->number);
	NODE* deleteNode = now;
	now = now->next;
	free(deleteNode);
	exit(0);

}