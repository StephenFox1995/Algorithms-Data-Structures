//
//  Stack.h
//  Stack
//
//  Created by Stephen Fox on 07/09/2015.
//  Copyright (c) 2015 Stephen Fox. All rights reserved.
//

#import <Foundation/Foundation.h>


@interface Stack : NSObject

/**
 Pushes a new element on to the top of the stack.
 
 @param x The data to push onto the top of the stack.
 */
- (void) push:(NSInteger) x;



/**
 'Pops' or removes the top most element from the stack.
 
 @return The data that was removed from the top of the stack.
 */
- (NSInteger) pop;


/**
 Returns the element at the top of the stack
 
 @return The top most element.
 */
- (NSInteger) peek;


/**
 Returns the current size of the stack.
 
 @return The size of the stack.
 */
- (NSInteger) size;



/**
 Returns a flag depending if the stack is empty or not.
 
 @return YES Stack is empty.
 @return NO  Stack is not empty.
 */
- (BOOL) isEmpty;



/**
 Returns a flag depending is the passed argument is contained
 in the stack.
 
 @return YES Is an element in the stack.
 @return NO  Is not an element in the stack.
 */
- (BOOL) isMember:(NSInteger) x;


/**
 Prints out the contents of the stack.
 */
- (void) display;
@end
