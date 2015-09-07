//
//  main.m
//  Stack
//
//  Created by Stephen Fox on 07/09/2015.
//  Copyright (c) 2015 Stephen Fox. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Stack.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        Stack *stack = [[Stack alloc] init];
        
        [stack push:45];
        [stack push:99];
        [stack push:100];
        [stack push:909];
        [stack push:92];
        
        [stack display];
        [stack pop];
        [stack display];
        
        [stack push:2];
        NSLog(@"Peek and found: %ld.\n", [stack peek]);
        
        NSLog(@"Stack size: %ld.\n", [stack size]);
        
        [stack push:55];
        
        NSLog(@"Stack size: %ld.\n", [stack size]);
      
    }
    return 0;
}
