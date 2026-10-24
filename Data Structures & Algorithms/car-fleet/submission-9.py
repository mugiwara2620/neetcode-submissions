class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = sorted(zip(position, speed), reverse=True)
        times = [(target - p) / s for p, s in cars]
        fleets = 0
        current_max_time = 0.0
        for time in times:
            if time > current_max_time:
                fleets += 1
                current_max_time = time
        return fleets