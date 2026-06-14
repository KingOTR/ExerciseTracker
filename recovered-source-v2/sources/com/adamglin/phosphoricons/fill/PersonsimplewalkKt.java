package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplewalk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleWalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonSimpleWalk", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleWalk", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplewalkKt {
    private static ImageVector _personSimpleWalk;

    public static final ImageVector getPersonSimpleWalk(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(120.0f, 48.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 136.0f);
        pathBuilder.curveToRelative(-28.64f, 0.0f, -41.81f, -13.3f, -55.75f, -27.37f);
        pathBuilder.curveToRelative(-3.53f, -3.57f, -7.18f, -7.26f, -11.0f, -10.58f);
        pathBuilder.curveToRelative(-37.0f, -32.14f, -96.22f, 22.73f, -98.72f, 25.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.95f, 11.66f);
        pathBuilder.arcTo(163.88f, 163.88f, 0.0f, false, true, 84.0f, 113.0f);
        pathBuilder.curveToRelative(13.78f, -7.38f, 25.39f, -10.23f, 34.7f, -8.58f);
        pathBuilder.lineTo(64.66f, 228.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.15f, 10.52f);
        pathBuilder.arcTo(7.84f, 7.84f, 0.0f, false, false, 72.0f, 240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.34f, -4.81f);
        pathBuilder.lineToRelative(33.59f, -77.27f);
        pathBuilder.lineTo(144.0f, 180.12f);
        pathBuilder.lineTo(144.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(160.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.35f, -6.51f);
        pathBuilder.lineToRelative(-37.2f, -26.57f);
        pathBuilder.lineTo(132.88f, 112.0f);
        pathBuilder.curveToRelative(2.64f, 2.44f, 5.26f, 5.07f, 8.0f, 7.84f);
        pathBuilder.curveTo(155.05f, 134.19f, 172.69f, 152.0f, 208.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleWalk = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
