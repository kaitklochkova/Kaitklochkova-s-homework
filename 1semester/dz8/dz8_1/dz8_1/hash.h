#pragma once

struct Hash;

// ���-�������
int hashFun(char *str);

// ��������� str � hash
void addHash(char *str, Hash *hash);

// �������� ���-�������
void printHash(Hash * hash);

//������� ������ ���-�������
Hash *createHash();

// ������� ���-�������
void delHash(Hash *hash);