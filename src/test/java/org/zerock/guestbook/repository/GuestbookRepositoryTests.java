package org.zerock.guestbook.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.zerock.guestbook.entity.Guestbook;
import org.zerock.guestbook.entity.QGuestbook;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class GuestbookRepositoryTests {

  @Autowired
  private GuestbookRepository guestbookRepository;

//  @Test
//  public void insertDummies(){
//    IntStream.rangeClosed(1,300).forEach(i->{
//      Guestbook guestbook = Guestbook.builder().title("Title..."+i)
//              .content("Content..."+i).writer("user"+i%10).build();
//      System.out.println(guestbookRepository.save(guestbook));
//    });
//  }

//  @Test
//  public void updateTest() {
//    Optional<Guestbook> result = guestbookRepository.findById(300L);
//    if(result.isPresent()) {
//      Guestbook guestbook = result.get();
//      guestbook.changeTitle("Changed Title...");
//      guestbook.changeContent("Changed Content...");
//      guestbookRepository.save(guestbook);
//    }
//  }

  //단일 항목으로 검색할 경우
//  @Test
//  public void testQuery1(){
//    Pageable pageable = PageRequest.of(0,10, Sort.by("gno").descending());
//    QGuestbook  qGuestbook  = QGuestbook.guestbook; //Q어저고 쿼리dsl쓰려고 만든것
//    String keyword = "1";
//    BooleanBuilder builder = new BooleanBuilder();
//    BooleanExpression expression = qGuestbook.title.contains(keyword);
//    builder.and(expression);
//    Page<Guestbook> result = guestbookRepository.findAll(builder, pageable);
//    result.stream().forEach(guestbook -> {
//      System.out.println(guestbook);
//    });
//  }

//  @Test
//  public void testQueryMany(){
//    Pageable pageable = PageRequest.of(0,10, Sort.by("gno").descending());
//    QGuestbook  qGuestbook  = QGuestbook.guestbook; //Q어저고 쿼리dsl쓰려고 만든것
//    String keyword = "1";
//    BooleanBuilder builder = new BooleanBuilder();
//
//    BooleanExpression exTitle = qGuestbook.title.contains(keyword);
//    BooleanExpression exContent = qGuestbook.content.contains(keyword);
//    BooleanExpression exAll = exTitle.or(exContent);
//
//    builder.and(exAll);
//    builder.and(qGuestbook.gno.gt(0L));
//
//    Page<Guestbook> result = guestbookRepository.findAll(builder, pageable);
//    result.stream().forEach(guestbook -> {
//      System.out.println(guestbook);
//    });
//  }
}
