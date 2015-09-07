//
//  Stack.m
//  Stack
//
//  Created by Stephen Fox on 07/09/2015.
//  Copyright (c) 2015 Stephen Fox. All rights reserved.
//

#import "Stack.h"

struct Node {
    NSInteger data;
    struct Node *next;
};

typedef struct Node Node;


Node* NodeCreate(NSInteger data, Node *next) {
    Node *newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = next;
    
    return newNode;
}



@interface Stack()

@property (nonatomic, assign) Node *top; // The top most item of the stack.

@end




@implementation Stack

#pragma mark Object Life Cycle.
- (instancetype) init {
    self = [super init];
    
    if (!self) {
        return nil;
    }
    
    _top = nil;
    
    return self;
}



- (void) push:(NSInteger) x {
    Node *newNode = NodeCreate(x, self.top);
    self.top = newNode;
}


- (NSInteger) pop {

    Node *popped = self.top;
    self.top = self.top->next;
    
    return popped->data;
    
}


- (BOOL)isEmpty {
    return self.top == nil;
}



- (BOOL)isMember:(NSInteger) x {
    
    Node *node = self.top;
    
    while (node != nil) {
        if (node->data == x) {
            return YES;
        } else {
            node = node->next;
        }
    }
    
    return NO;
    
}


- (void) display {
    
    Node *node = self.top;
    
    NSLog(@"Stack contents:\n");
    
    while (node != nil) {
        NSLog(@"%ld\n", node->data);
        node = node->next;
    }
}


- (NSInteger) peek {
    Node *node = self.top;
    
    return node->data;
}


- (NSInteger) size {
    Node *node = self.top;
    int counter = 0;
    
    while (node != nil) {
        counter ++;
        node = node->next;
    }
    
    return counter;
}


@end
