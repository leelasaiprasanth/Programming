class Job:
    def __init__(self, id, deadline, profit):
        self.id = id
        self.deadline = deadline
        self.profit = profit

def job_sequencing(jobs):
    # Sort jobs in decreasing order of profit
    jobs.sort(key=lambda x: x.profit, reverse=True)
    
    n = len(jobs)
    max_deadline = max(job.deadline for job in jobs)
    
    # Create a list to keep track of free slots
    slots = [-1] * (max_deadline + 1)
    
    total_profit = 0
    job_count = 0
    
    for job in jobs:
        # Find a slot for this job
        for slot in range(min(max_deadline, job.deadline), 0, -1):
            if slots[slot] == -1:
                slots[slot] = job.id
                total_profit += job.profit
                job_count += 1
                break
    
    return job_count, total_profit

if __name__ == "__main__":
    # Example jobs
    jobs = [
        Job(1, 4, 20),
        Job(2, 1, 10),
        Job(3, 1, 40),
        Job(4, 1, 30),
    ]
    
    job_count, total_profit = job_sequencing(jobs)
    print(f"Number of jobs done: {job_count}")
    print(f"Total profit: {total_profit}")
