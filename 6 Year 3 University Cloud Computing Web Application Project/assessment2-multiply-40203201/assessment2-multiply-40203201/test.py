import unittest
import main

class TestMultiplyMethod(unittest.TestCase):

    def test_multiply(self):
        self.assertEquals(main.multiply(2,5), 10)

if __name__ == '__main__':
    unittest.main()