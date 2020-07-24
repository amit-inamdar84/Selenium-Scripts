package notes;

public class GitNotes {

	public static void main(String[] args) {
/*	    How to use Git hub : https://guides.github.com/activities/hello-world/	
 *      Login to Github and create a repository
		If repository already exists, import or clone to your eclipse
		Download git from https://git-scm.com/download/
		Install in C:\Program Files\Git
		If project already exists in eclipse do Team>>Share Project and create a git local repository in same drive as eclipse workspace
		Open command prompt go to local repository
		C:\>D:
		D:\>cd Git
		D:\Git>git status
		D:\Git>git pull - This is required if we want to get the code updates/commits of other team members.
		D:\Git>git stash - Temporarily saves only modified files and will not be listed for commit.
		D:\Git>git stash -u - Temporarily saves both modified files and new files and will not be listed for commit.
		Type 
		D:\Git>git add filename
		OR
		D:\Git>git add .
		D:\Git>git commit -m "comments"
		D:\Git>git push
		After above commands are executed, code will be committed to remote repository-master
		-----------------------------------------------------------------------------------------------------
		Then create a branch. -b argument should be given only when creating new branch. For existing branch checkout skip -b.
		
		D:\Git>git checkout -b "branch name"
Switched to a new branch 'branch name'
D:\Git>git branch
* branch name
  master
D:\Git>git branch
* bhanu_local
  master
D:\Git>git status
On branch branch name
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
        modified:   src/main/java/com/test/selenium/testbase/B.java
no changes added to commit (use "git add" and/or "git commit -a")
D:\Git>git add .
D:\Git>git commit -m "Modifed some code in class"
[branch name d7a53c6] Modifed some code in class
 1 file changed, 4 insertions(+)
D:\Git>git push
fatal: The current branch bhanu_local has no upstream branch.
To push the current branch and set the remote as upstream, use
    git push --set-upstream origin bhanu_local
D:\Git>git push origin branch name
Counting objects: 10, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (10/10), 751 bytes | 375.00 KiB/s, done.
Total 10 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/LearnByBhanuPratap/seleniumScripts.git
 * [new branch]      bhanu_local -> bhanu_local
 * 
 * Now we have to get the peer review done. Go to Git hub and click on Compare and pull request.
 * Click on create pull request after seeing the comparison.
 * Share the pull request URL for peer review.
 * Once review is done and approved, go to the same URL and click on Merge pull request. This will send code to the master branch.
 *  
 * The below command will give the latest code from master
D:\Git>git pull origin master
From https://github.com/LearnByBhanuPratap/seleniumScripts
 * branch            master     -> FETCH_HEAD
Updating d7a53c6..225a089
Fast-forward
D:\Git>git status
On branch branch name
nothing to commit, working tree clean
D:\Git>git branch
* branch name
  master
  
  Or instead of above code below code will also give the latest code from master
D:\Git>git checkout master
Switched to branch 'master'
Your branch is behind 'origin/master' by 2 commits, and can be fast-forwarded.
  (use "git pull" to update your local branch)
D:\Git>git branch
  branch name
* master
D:\Git>git checkout branch name
Switched to branch 'branch name'
D:\Git>git branch
* branch name
  master
*/		

	}

}
