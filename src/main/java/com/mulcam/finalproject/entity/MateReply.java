package com.mulcam.finalproject.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MateReply {
	
	private Long rid; // 댓글 rid
	private Long uid; // --> user.fk
	private Long mid; // --> mate.fk  // 글번호 
	private String nickname; // --> user.fk
	private String content;  // 댓글내용 
	private LocalDateTime regDate; // 댓글 등록일,시간 
	private int isMine; 
 	private int grp; // 댓글 참조번호 
	private int grps; // 같은 댓글 그룹내 순서 
	private int grpl;  // 댓글 들여쓰기 레벨  
	private int isDeleted; // 댓글 삭제  여부

	public MateReply(Long uid, Long mid, String nickname, String content,int grp,int isMine) {
		this.uid = uid;
		this.mid = mid;
		this.nickname = nickname;
		this.content = content;
		this.grp = grp;
		this.isMine  = isMine;
		
	
	}
	
	

}
