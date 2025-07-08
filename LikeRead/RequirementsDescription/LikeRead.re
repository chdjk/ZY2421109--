As a user, I want to register and log in, so that I can access website and manage account security
{
	Basic Flow {
	(User)1. the user shall access login page.
	(User)2. the user shall click register link.
	(User)3. the user shall fill registration form and submit.
	(System)4. the system shall save user data and redirect to login page.
	(User)5. the user shall enter credentials and click login.
	(System)6. the system shall verify credentials and redirect to homepage.
}

	Alternative Flow {
		A. At any time, Existing user login :
		1. User chooses to log in directly.
		2. User enter existing credentials and click login.
		3. System verify credentials and redirect to homepage.
		B. At any time, Password reset :
		1. User clicks forgot password.
		2. User enter email and request a reset link.
		3. System send a password reset email.
		4. User follow email instructions to set a new password.
		C. At any time, Change password :
		1. User navigates to account settings.
		2. User enter old and new passwords.
		3. System verify and update password.
	}
}

As a user, I want to follow or unfollow users and view followers, so that I can track content and manage connections
{
	Basic Flow {
		(User)1. the user shall log in.
		(User)2. the user shall browse content.
		(User)3. the user shall click Follow button on another user profile.
		(System)4. the system shall add user to a following list.
		(System)5. the system shall update follower counts for both users.
	}
	Alternative Flow {
		A. At any time, Unfollow :
		1. User clicks Unfollow button.
		2. System remove user from following list.
		B. At any time, View followers :
		1. User navigates to their profile.
		2. System display follower count and list.
	}
}

As a user, I want to like content, so that I can show appreciation and view popularity metrics
	{
	Basic Flow {
		(User)1. the user shall log in.
		(User)2. the user shall browse to content.
		(User)3. the user shall click Like button.
		(System)4. the system shall increment like count.
		(System)5. the system shall display updated likes to all viewers.
	}
}

As a user, I want to publish or delete comments, so that I can engage with content
{
	Basic Flow {
		(User)1. the user shall log in.
		(User)2. the user shall browse to content.
		(User)3. the user shall enter a comment.
		(User)4. the user shall click Submit button.
		(System)5. the system shall display comment publicly.
	}
	Alternative Flow {
		A. At any time, Delete comment :
		1. User views their own comment.
		2. User click Delete button.
		3. System remove comment.
	}
}

As a admin, I want to delete illegal content and notify users, so that I can enforce policies
{
	Basic Flow {
		(User)1. the admin shall log in to backend.
		(User)2. the admin shall identify illegal content.
		(User)3. the admin shall delete content.
		(System)4. the system shall send a notification to content owner.
		(System)5. the system shall allow user feedback.
	}
}

As a user, I want to submit content to homepage, so that it can be promoted
{
	Basic Flow {
		(User)1. the user shall log in.
		(User)2. the user shall select content for homepage submission.
		(User)3. the user shall click Submit to Homepage button.
		(System)4. the system shall forward content to admins.
	}
}

As a admin, I want to approve or reject homepage submissions, so that I can curate content
{
	Basic Flow {
		(User)1. the admin shall review submissions.
		(User)2. the admin shall approve content.
		(System)3. the system shall publish content on homepage.
		(System)4. the system shall notify user of approval.
	}
	Alternative Flow {
		A. At any time, Reject submission :
		1. The admin rejects content.
		2. The admin provide feedback.
		3. System notify user of rejection.
	}
}

As a user, I want to submit to columns, so that my content is categorized
{
	Basic Flow {
		(User)1. the user shall select a column for submission.
		(User)2. the user shall submit content.
		(System)3. the system shall forward it to column admins.
	}
}

As a admin, I want to review column submissions, so that I maintain quality
{
	Basic Flow {
		(User)1. the admin shall review submissions.
		(User)2. the admin shall approve content.
		(System)3. the system shall publish it in column.
		(System)4. the system shall notify user.
	}
	Alternative Flow {
		A. At any time, Reject submission :
		1. The admin rejects content.
		2. System notify user with reasons.
	}
}

As a user, I want to browse homepage, so that I discover content
{
	Basic Flow {
		(User)1. the user shall access homepage.
		(System)2. the system shall display fifty items with publish time title author type views likes and collects.
		(User)3. the user shall click More button to load additional content.
		(System)4. the system shall fetch and append more items.
	}
}

As a user, I want to publish content, so that it is stored and searchable
{
	Basic Flow {
		(User)1. the user shall enter a title and content.
		(User)2. the user shall click Publish button.
		(System)3. the system shall generate a timestamp and save to database.
		(System)4. the system shall return to homepage.
	}
}

As a user, I want to delete my content, so that I manage my posts
{
	Basic Flow {
		(User)1. the user shall select their content.
		(User)2. the user shall click Delete button.
		(System)3. the system shall show a confirmation prompt.
		(User)4. the user shall confirm deletion.
		(System)5. the system shall remove content.
	}
}

As a user, I want to edit my content, so that I correct or update it
{
	Basic Flow {
		(User)1. the user shall select their content.
		(User)2. the user shall click Edit button.
		(User)3. the user shall modify title or content.
		(User)4. the user shall click Save button.
		(System)5. the system shall show a confirmation prompt.
		(User)6. the user shall confirm changes.
		(System)7. the system shall update content.
	}
}

As a user, I want to browse content, so that I read and manage posts
{
	Basic Flow {
		(User)1. the user shall view titles and profiles.
		(User)2. the user shall click a title to view details.
		(System)3. the system shall add content to browsing history.
		(System)4. the system shall display publish time and author.
		(System)5. the system shall show Edit or Delete buttons.
	}
}

As a user, I want to search content, so that I find relevant posts
{
	Basic Flow {
		(User)1. the user shall enter a search string.
		(User)2. the user shall click Search button.
		(System)3. the system shall search titles content and usernames.
		(System)4. the system shall display results.
	}
}  

As a user, I want to create or export notes, so that I archive content
{
	Basic Flow {
		(User)1. the user shall click Take Notes on content.
		(System)2. the system shall add it to user notes.
		(User)3. the user shall edit notes.
		(User)4. the user shall click Export to PDF button.
		(System)5. the system shall generate a PDF download.
	}
	Alternative Flow {
		A. At any time, Delete note :
		1. The user selects a note.
		2. User click Delete button.
		3. System show a confirmation prompt.
		4. User confirm deletion.
	}
}
   
As a user, I want to view browsing history, so that I revisit content
{
	Basic Flow {
		(User)1. the user shall access history.
		(System)2. the system shall show recent items with title content author and access time.
		(User)3. the user shall search history by date.
		(System)4. the system shall filter and display results.
	}
}

As a admin, I want to manage permissions, so that I control access
{
	Basic Flow {
		(User)1. the admin shall edit role permissions.
		(System)2. the system shall represent modules as a tree.
		(User)3. the admin shall save changes.
		(System)4. the system shall apply updated permissions.
	}
}

As a user, I want to report content, so that I flag violations
{
	Basic Flow {
		(User)1. the user shall click Report button on content.
		(System)2. the system shall redirect to a report page.
		(User)3. the user shall select a report type.
		(User)4. the user shall submit report.
		(System)5. the system shall record report.
	}
}

As a user, I want to block content, so that I customize my feed
{
	Basic Flow {
		(User)1. the user shall click Block button on content.
		(System)2. the system shall hide content.
	}
}

As a user, I want to ask questions, so that I seek answers
{
	Basic Flow {
		(User)1. the user shall click Ask button.
		(User)2. the user shall enter a question.
		(User)3. the user shall click Publish button.
		(System)4. the system shall post question publicly.
	}
}

As a user, I want to answer questions, so that I share knowledge
{
	Basic Flow {
		(User)1. the user shall click Answer button on a question.
		(User)2. the user shall enter an answer.
		(User)3. the user shall click Publish button.
		(System)4. the system shall post answer publicly.
	}
}

                   