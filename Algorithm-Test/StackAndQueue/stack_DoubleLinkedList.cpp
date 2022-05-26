#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


void pushNode();
void popNode();
void showAllNodes();
void exit();

struct NODE
{
	NODE* pre;
	NODE* next;

	int number;
};

NODE* head;
NODE* tail;

int main() {

	int a;

	head = (NODE*)malloc(sizeof(struct NODE));
	head->next = NULL;
	head->pre = NULL;
	tail = head;

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
	node->next = NULL;

	if (isEmpty()) {

		/*tail = (NODE*)malloc(sizeof(struct NODE));
		tail->next = NULL;
		tail->pre = node;*/


		head->next = node;
		node->pre = head;

		tail = node;

	}
	else {
		NODE* prevNode = tail;
		prevNode->next = node;
		node->pre = prevNode;

		tail = node;

	}
}

void showAllNodes() {

	NODE* now = head->next; // 林家历厘
	if (!isEmpty()) {

		do {
			printf("number : %d\n", now->number);
			now = now->next;
		} while (now != NULL);
	}
	else {
		printf("There is no Node\n");
	}


}


void popNode() {

	if (!isEmpty()) {

		NODE* prevNode = tail->pre;
		NODE* deleteNode = tail;

		printf("pop (0x%p) : %d\n", deleteNode, deleteNode->number);

		free(deleteNode);
		prevNode->next = NULL;
		tail = prevNode;

	}
	else {
		printf("There is no Node\n");
	}
}
void exit() {

	NODE* now = head; // 林家历厘
	while (now != NULL) {
		printf("Node(%d) has been POP\n", now->number);
		NODE* deleteNode = now;
		now = now->next;
		free(deleteNode);
	}

	/*printf("Node(%d) has been POP\n", tail->number);

	printf("end");
	free(tail);*/
	exit(0);

}