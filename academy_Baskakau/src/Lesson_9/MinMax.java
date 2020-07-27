package Lesson_9;


	public class MinMax <M extends Number> {
		private M[] array;

		public MinMax(M[] array) {
			this.array = array;
		}

		  public double findMin() {
			M firstMin = array[0];
			
			for (int i=0; i < array.length; i++) {
				if (array[i].doubleValue()< firstMin.doubleValue()) {
					firstMin = array[i];
				}
			}
			
			return firstMin.doubleValue();
		  }
		  public double findMax() {
			  M firstMax = array[0];
			  for (int i=0; i < array.length; i++) {
					if (array[i].doubleValue()> firstMax.doubleValue()) {
						firstMax = array[i];
					}
				}
			  return firstMax.doubleValue();
			  
			  
//			for (T value : array) {
//				sum += value.doubleValue();
//			}
//
//			return sum / array.length;
//		}
//
//		boolean sameAvg(Average2<?> ob) {
//			return average() == ob.average();
//		}
//		{
//	double max = T[] array;
//	for (int i = 1; i < array.length; i++) {
//        if (array[i] > max) max = array[i];
//     }
//     System.out.println("Наибольший элемент: " + max);
		}
	}
	
	