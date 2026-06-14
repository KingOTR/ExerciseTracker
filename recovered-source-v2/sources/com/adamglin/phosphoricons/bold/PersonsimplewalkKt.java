package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplewalk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleWalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPersonSimpleWalk", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleWalk", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplewalkKt {
    private static ImageVector _personSimpleWalk;

    public static final ImageVector getPersonSimpleWalk(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _personSimpleWalk;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleWalk", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 84.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.curveToRelative(-37.0f, 0.0f, -55.27f, -18.47f, -70.0f, -33.3f);
        pathBuilder.curveToRelative(-1.71f, -1.72f, -3.36f, -3.4f, -5.0f, -5.0f);
        pathBuilder.lineToRelative(-8.63f, 19.85f);
        pathBuilder.lineTo(159.0f, 166.23f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.0f, 9.77f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 182.17f);
        pathBuilder.lineToRelative(-25.37f, -18.12f);
        pathBuilder.lineTo(83.0f, 236.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.0f, -9.57f);
        pathBuilder.lineToRelative(50.06f, -115.13f);
        pathBuilder.quadToRelative(-10.64f, 0.75f, -25.0f, 8.4f);
        pathBuilder.arcToRelative(159.78f, 159.78f, 0.0f, false, false, -29.83f, 21.23f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.43f, -17.5f);
        pathBuilder.curveToRelative(2.61f, -2.45f, 64.36f, -59.67f, 104.09f, -25.18f);
        pathBuilder.curveToRelative(3.94f, 3.42f, 7.64f, 7.16f, 11.22f, 10.78f);
        pathBuilder.curveTo(168.43f, 123.28f, 181.0f, 136.0f, 208.0f, 136.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleWalk = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
