/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ltk.core.refactoring.participants;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ltk.internal.core.refactoring.ParticipantDescriptor;

/**
 * An opaque list to manage sharable participants.
 * <p>
 * The list is managed by the refactoring itself. Clients typically
 * only pass the list to the corresponding method defined in 
 * {@link org.eclipse.ltk.core.refactoring.participants.ParticipantManager}
 * </p>
 * <p> 
 * Note: this class is not intended to be extended by clients.
 * </p>
 * 
 * @see ISharableParticipant
 * @see org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring
 * @see org.eclipse.ltk.core.refactoring.participants.ParticipantManager
 * 
 * @since 3.0
 */
public class SharableParticipants {
	
	private Map fMap= new HashMap();
	
	/* package */ void put(ParticipantDescriptor descriptor, RefactoringParticipant participant) {
		fMap.put(descriptor, participant);		
	}
	/* package */ RefactoringParticipant get(ParticipantDescriptor descriptor) {
		return (RefactoringParticipant)fMap.get(descriptor);
	}
}
