추가 학습

배열 메서드 문제

다음 배열의 각 원소에 2를 곱한 값을 출력하시오(forEach)

```
const arr = [1, 2, 3, 4];
//2,4,6,8
```

다음 이름 배열에서 모든 이름을 대문자로 변환하는 배열을 만드시오(map)

```
const names = ['alice', 'bob', 'charlie'];
// ["ALICE", "BOB", "CHARIE"]
```

다음 숫자 배열에서 짝수만 골라 배열로 만드시오(filter)

```
const numbers = [1, 2, 3, 4, 5, 6];
// [2, 4, 6]
```

다음 배열의 모든 숫자를 더한 합계를 구하시오(reduce)

```
const nums = [10, 20, 30];
// 60
```

다음 배열에 홀수가 하나라도 있는지 확인하세요.(some)

```
const nums = [2, 4, 6, 8, 9];
// true
```

다음 배열의 모든 문자가 소문자인지 검사하시오(every)

```
const chars = ['a', 'b', 'c'];
// true
```

다음 점수 배열에서 90 이상인 첫 번째 점수를 찾으세요(find)

```
const scores = [70, 85, 92, 88];
// 92
```

다음 이름 배열에서 "kim"이 처음 등장하는 인덱스를 구하시오(findIndex)

```
const names = ['lee', 'park', 'kim', 'choi', 'kim'];
// 2
```

다음 배열에 특정 값이 포함되어 있는지 확인하시오.(includes)

```
const fruits = ['banana', 'apple', 'orange'];
// (apple) -> true
```

다음 숫자 배열을 오름차순으로 정렬하시오(sort)

```
const numbers = [5, 1, 7, 3];
// [1, 3, 5, 7]
```

2차원 배열을 1차원으로 펼치시오(flat)

```
const arr = [1, [2, 3], [4, 5]];
// [1, 2, 3, 4, 5]
```

---

다음과 같은 배열을 하드코딩하고, 문제 조건에 맞추어 출력하시오

```
const students = [
  { name: "Alice", score: 85, passed: true },
  { name: "Bob", score: 42, passed: false },
  { name: "Charlie", score: 91, passed: true },
  { name: "David", score: 55, passed: false },
  { name: "Eve", score: 78, passed: true }
];

forEach: 각 학생 이름과 점수를 출력하시오

map: 점수만 따로 뽑은 배열을 생성하시오

filter: 통과한 학생만 추출하시오

reduce: 전체 평균 점수를 계산하시오

some: 낙제한 학생이 한 명이라도 있는지 확인하시오

every: 모든 학생이 50점 이상인지 확인하시오

find: 첫 번째 낙제 학생을 찾으시오

findIndex: 점수가 90 이상인 첫 번째 학생의 인덱스를 구하시오

```

---

당신은 온라인 쇼핑몰의 개발자입니다. 사용자에게 다음과 같은 shoppingCart 데이터가 주어졌을 때, 주어진 요구사항을 만족하는 JavaScript 코드를 작성하세요. 각 요구사항은 특정 배열 메서드를 사용하여 해결하시오

```
const shoppingCart = [
  { id: 1, name: '노트북', price: 1200000, quantity: 1, category: '전자기기' },
  { id: 2, name: '스마트폰', price: 800000, quantity: 2, category: '전자기기' },
  { id: 3, name: '키보드', price: 150000, quantity: 1, category: '전자기기' },
  { id: 4, name: '마우스', price: 50000, quantity: 3, category: '전자기기' },
  { id: 5, name: '티셔츠', price: 30000, quantity: 5, category: '의류' },
  { id: 6, name: '청바지', price: 70000, quantity: 2, category: '의류' },
  { id: 7, name: '컵라면', price: 1500, quantity: 10, category: '식품' },
  { id: 8, name: '생수', price: 1000, quantity: 15, category: '식품' },
];

//요구사항

forEach 활용: 카트의 각 상품에 대해 "상품명: [상품이름], 가격: [가격]원, 수량: [수량]개" 형식으로 콘솔에 출력하세요.

map 활용: 각 상품의 총 금액 (price * quantity)을 계산하여 새로운 배열 itemTotalPrices를 만드세요.

filter 활용: 가격이 100,000원 이상인 상품들만 필터링하여 새로운 배열 expensiveItems를 만드세요.

reduce 활용: shoppingCart의 모든 상품에 대한 **총 주문 금액 (모든 상품의 (price * quantity) 합계)**을 계산하여 totalOrderAmount 변수에 저장하세요.

some 활용: 카트에 '식품' 카테고리의 상품이 하나라도 있는지 확인하고 그 결과를 hasFoodItems 변수에 저장하세요.

every 활용: 카트의 모든 상품의 수량(quantity)이 1개 이상인지 확인하고 그 결과를 allQuantitiesValid 변수에 저장하세요.

find 활용: id가 6인 상품을 찾아 itemWithId6 변수에 저장하세요.

findIndex 활용: 카테고리가 '의류'인 첫 번째 상품의 인덱스를 찾아 firstClothingItemIndex 변수에 저장하세요.

sort 활용: 상품의 가격을 기준으로 오름차순 정렬된 새로운 배열 sortedByPrice를 만드세요. (원본 배열은 변경하지 않도록 주의)

```
