/*Реализовать АТД "множество" на основе двоичного дерева поиска. Программа должна позволять в интерактивном режиме добавлять значения целого типа в множество, удалять значения, 
проверять, принадлежит ли значение множеству, печатать текущие элементы множества в возрастающем и убывающем порядках.*/
#include <stdio.h>
#include <locale.h>

struct TreeElement
{
	int value;
	TreeElement *leftSon;
	TreeElement *rightSon;
};

struct Tree
{
	TreeElement *root;
};

Tree *createTree()
{
	Tree *tree = new Tree;
	tree->root = NULL;
	return tree;
}

void addEl(Tree *tree, int value)
{
	TreeElement *temp = new TreeElement;
	TreeElement *i = tree->root;
	temp->value = value;
	temp->leftSon = NULL;
	temp->rightSon = NULL;
	bool flagOfEndTree = false;
	if (tree->root == NULL)
		{
			tree->root = temp;
			tree->root->leftSon = NULL;
			tree->root->rightSon = NULL;
		}
	else
		while (!flagOfEndTree)
		{
			if (i->value <= value)
				if (i->rightSon == NULL)
				{
					i->rightSon = temp;
					flagOfEndTree = true;
				}
				else
					i = i->rightSon;
			else
				if (i->leftSon == NULL)
				{
					i->leftSon = temp;
					flagOfEndTree = true;
				}
				else
					i = i->leftSon;
		}
}

//void delEl(Tree *tree, int value)
//{
//	TreeElement *i = tree->root;
//	while (true)
//		{
//			if (i->value == value)
//			{
//				
//			}
//			else if (i->value < value)
//				if (i->rightSon == NULL)
//				{
//					printf("Такого элемента в дереве нет");
//					break;
//				}
//				else
//					i = i->rightSon;
//			else 
//				if (i->leftSon == NULL)
//				{
//					printf("Такого элемента в дереве нет");
//					break;
//				}
//				else
//					i = i->leftSon;
//		}
//}

void printElLeft(Tree *tree, TreeElement *i)
{
	if (i->leftSon != NULL)
		printElLeft(tree, i->leftSon);
	printf("%d ", i->value);
	if (i->rightSon != NULL) 
		printElLeft(tree, i->rightSon);
}

void printLowest(Tree *tree)
{
	printElLeft(tree, tree->root);
	printf("\n");
}

void printElRight(Tree *tree, TreeElement *i)
{
	if (i->rightSon != NULL)
		printElRight(tree, i->rightSon);
	printf("%d ", i->value);
	if (i->leftSon != NULL) 
		printElRight(tree, i->leftSon);
}

void printDescending(Tree *tree)
{
	printElRight(tree, tree->root);
	printf("\n");
}

bool inTree(Tree *tree, int value)
{
	TreeElement *i = tree->root;
	while (true)
		{
			if (i->value == value)
				return true;
			else if (i->value < value)
				if (i->rightSon == NULL)
				{
					return false;
				}
				else
				{
					i = i->rightSon;
				}
			else 
				if (i->leftSon == NULL)
				{
					return false;
				}
				else
					i = i->leftSon;
		}
}

int main()
{
	Tree *tree = createTree();
	setlocale(LC_ALL, "Russian");
	printf("Введите: 0 - выход\n1 - добавить целое число в дерево\n2 - удалить значения\n3 - проверить, принадлежит ли значение множеству\n4 - печатать в возрастающем порядке\n5 - печатать в убывающем порядке\n");
	char state = 0;
	while (state != '0')
	{
		scanf("%c", &state);
		if (state == '1')
		{
			printf("Введите число, которое необходимо добавить: ");
			int value = 0;
			scanf("%d", &value);
			addEl(tree, value);
		}
		if (state == '2')
		{
			break;
		}
		if (state == '3')
		{
			printf("Введите число, которое необходимо проверить: ");
			int value = 0;
			scanf("%d", &value);
			if (inTree(tree, value))
				printf("Принадлежит\n");
			else
				printf("Не принадлежит\n");
		}
		if (state == '4')
			printLowest(tree);
		if (state == '5')
			printDescending(tree);
	}
}