package com.example.antibrokedswu


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.antibrokedswu.mbti.MyMbtiFragment

class MbtiFragment : Fragment() {

    private val answers = BooleanArray(12)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mbti, container, false)

        val btnQ1Yes: Button = view.findViewById(R.id.btn_q1_yes)
        val btnQ1No: Button = view.findViewById(R.id.btn_q1_no)

        btnQ1Yes.setOnClickListener { answers[0] = true }
        btnQ1No.setOnClickListener { answers[0] = false }

        val btnQ2Yes: Button = view.findViewById(R.id.btn_q2_yes)
        val btnQ2No: Button = view.findViewById(R.id.btn_q2_no)

        btnQ2Yes.setOnClickListener { answers[0] = true }
        btnQ2No.setOnClickListener { answers[0] = false }

        val btnQ3Yes: Button = view.findViewById(R.id.btn_q3_yes)
        val btnQ3No: Button = view.findViewById(R.id.btn_q3_no)

        btnQ3Yes.setOnClickListener { answers[0] = true }
        btnQ3No.setOnClickListener { answers[0] = false }

        val btnQ4Yes: Button = view.findViewById(R.id.btn_q4_yes)
        val btnQ4No: Button = view.findViewById(R.id.btn_q4_no)

        btnQ4Yes.setOnClickListener { answers[0] = true }
        btnQ4No.setOnClickListener { answers[0] = false }

        val btnQ5Yes: Button = view.findViewById(R.id.btn_q5_yes)
        val btnQ5No: Button = view.findViewById(R.id.btn_q5_no)

        btnQ5Yes.setOnClickListener { answers[0] = true }
        btnQ5No.setOnClickListener { answers[0] = false }

        val btnQ6Yes: Button = view.findViewById(R.id.btn_q6_yes)
        val btnQ6No: Button = view.findViewById(R.id.btn_q6_no)

        btnQ6Yes.setOnClickListener { answers[0] = true }
        btnQ6No.setOnClickListener { answers[0] = false }

        val btnQ7Yes: Button = view.findViewById(R.id.btn_q7_yes)
        val btnQ7No: Button = view.findViewById(R.id.btn_q7_no)

        btnQ7Yes.setOnClickListener { answers[0] = true }
        btnQ7No.setOnClickListener { answers[0] = false }

        val btnQ8Yes: Button = view.findViewById(R.id.btn_q8_yes)
        val btnQ8No: Button = view.findViewById(R.id.btn_q8_no)

        btnQ8Yes.setOnClickListener { answers[0] = true }
        btnQ8No.setOnClickListener { answers[0] = false }

        val btnQ9Yes: Button = view.findViewById(R.id.btn_q9_yes)
        val btnQ9No: Button = view.findViewById(R.id.btn_q9_no)

        btnQ9Yes.setOnClickListener { answers[0] = true }
        btnQ9No.setOnClickListener { answers[0] = false }

        val btnQ10Yes: Button = view.findViewById(R.id.btn_q10_yes)
        val btnQ10No: Button = view.findViewById(R.id.btn_q10_no)

        btnQ10Yes.setOnClickListener { answers[0] = true }
        btnQ10No.setOnClickListener { answers[0] = false }

        val btnQ11Yes: Button = view.findViewById(R.id.btn_q11_yes)
        val btnQ11No: Button = view.findViewById(R.id.btn_q11_no)

        btnQ11Yes.setOnClickListener { answers[0] = true }
        btnQ11No.setOnClickListener { answers[0] = false }

        val btnQ12Yes: Button = view.findViewById(R.id.btn_q12_yes)
        val btnQ12No: Button = view.findViewById(R.id.btn_q12_no)

        btnQ12Yes.setOnClickListener { answers[0] = true }
        btnQ12No.setOnClickListener { answers[0] = false }

        // 결과 보기 버튼
        val btnFinish: Button = view.findViewById(R.id.btn_next)
        btnFinish.setOnClickListener {
            val bundle = Bundle().apply {
                putBooleanArray("answers", answers)
            }

            val resultFragment = MyMbtiFragment().apply {
                arguments = bundle
            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.container, resultFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
